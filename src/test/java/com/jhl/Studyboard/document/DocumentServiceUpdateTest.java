package com.jhl.StudyBoard.document;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.jhl.StudyBoard.data.DocumentData;
import com.jhl.StudyBoard.entity.Document;
import com.jhl.StudyBoard.entity.DocumentAndTag;
import com.jhl.StudyBoard.entity.Photo;
import com.jhl.StudyBoard.entity.PhotoText;
import com.jhl.StudyBoard.service.DocumentService;

@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DocumentServiceUpdateTest {

	@Autowired
	private DocumentService documentService;

	private Long savedDocumentId;

	@Before
	public void insert() {
		Document saved = documentService.insert(DocumentData.initData());
		savedDocumentId = saved.getId();
	}

	@Test
	public void update() {
		// update data
		Document data = DocumentData.updateData(savedDocumentId);

		// update
		Document updated = documentService.update(data);

		// document
		assertThat(updated).isNotNull();
		assertThat(updated.getId()).isEqualTo(data.getId());
		assertThat(updated.getTitle()).isEqualTo(data.getTitle());
		assertThat(updated.getContent()).isEqualTo(data.getContent());

		// photos
		List<Photo> updatedPhotos = updated.getPhotos();
		List<Photo> dataPhotos = data.getPhotos();
		assertThat(updatedPhotos).isNotEmpty();
		assertThat(updatedPhotos.size()).isEqualTo(dataPhotos.size());
		for(int i = 0; i < updatedPhotos.size(); i++) {
			assertThat(updatedPhotos.get(i).getDocument().getId()).isEqualTo(data.getId());
			assertThat(updatedPhotos.get(i).getFile_path()).isEqualTo(dataPhotos.get(i).getFile_path());
			assertThat(updatedPhotos.get(i).getFile_name()).isEqualTo(dataPhotos.get(i).getFile_name());
			
			// photo texts
			List<PhotoText> updatedPhotoTexts = updatedPhotos.get(i).getPhoto_texts();
			List<PhotoText> dataPhotoTexts = dataPhotos.get(i).getPhoto_texts();
			assertThat(updatedPhotoTexts).isNotNull();
			assertThat(updatedPhotoTexts.size()).isEqualTo(dataPhotoTexts.size());
			for(int j = 0; j < dataPhotoTexts.size(); j++) {
				//assertThat(updatedPhotoTexts.get(j).getPhoto().getId()).isEqualTo(dataPhotoTexts.get(j).getPhoto().getId());
				assertThat(updatedPhotoTexts.get(j).getPosition_x()).isEqualTo(dataPhotoTexts.get(j).getPosition_x());
				assertThat(updatedPhotoTexts.get(j).getPosition_y()).isEqualTo(dataPhotoTexts.get(j).getPosition_y());
				assertThat(updatedPhotoTexts.get(j).getText()).isEqualTo(dataPhotoTexts.get(j).getText());
			}
		}
		
		// tags
		List<DocumentAndTag> updatedMappings = updated.getMappings();
		List<DocumentAndTag> dataMappings = data.getMappings();
		assertThat(updatedMappings).isNotEmpty();
		assertThat(updatedMappings.size()).isEqualTo(dataMappings.size());
		updatedMappings.stream().forEach(m -> {
			assertThat(dataMappings.contains(m)).isTrue();
		});
	}
}