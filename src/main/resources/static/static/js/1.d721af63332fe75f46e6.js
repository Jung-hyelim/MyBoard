webpackJsonp([1],{"H+wM":function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=n("mtWM"),a=n.n(o),l={data:function(){return{document:{}}},created:function(){this.getDocument(this.$route.params.id)},methods:{getDocument:function(t){var e=this;a()({method:"get",url:this.$store.state.BASE_URL+"/"+t}).then(function(t){e.document=t.data}).catch(function(t){console.log(t),alert("비정상 접근입니다."),e.$router.push({name:"home"})})},deleteDocument:function(){var t=this;confirm(this.document.title+" 을 삭제하시겠습니까?")&&a()({method:"delete",url:this.$store.state.BASE_URL+"/"+this.document.id}).then(function(t){alert("삭제되었습니다.")}).catch(function(t){console.log(t),alert("문제가 발생하여 삭제되지 않았습니다.")}).then(function(){t.$router.push({name:"home"})})}}},i={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-container",[n("v-card",{staticClass:"pa-5",attrs:{elevation:"12"}},[n("v-card-text",[n("v-layout",{attrs:{"align-center":"","justify-center":"",row:"","fill-height":""}},[n("v-text-field",{attrs:{label:"No.",type:"text",outlined:"",readonly:""},model:{value:t.document.id,callback:function(e){t.$set(t.document,"id",e)},expression:"document.id"}})],1),t._v(" "),n("v-layout",{attrs:{"align-center":"","justify-center":"",row:"","fill-height":""}},[n("v-text-field",{attrs:{label:"조회수",type:"text",outlined:"",readonly:""},model:{value:t.document.read_count,callback:function(e){t.$set(t.document,"read_count",e)},expression:"document.read_count"}}),t._v(" "),n("v-text-field",{attrs:{label:"생성일자",type:"text",outlined:"",readonly:""},model:{value:t.document.create_date,callback:function(e){t.$set(t.document,"create_date",e)},expression:"document.create_date"}}),t._v(" "),n("v-text-field",{attrs:{label:"수정일자",type:"text",outlined:"",readonly:""},model:{value:t.document.update_date,callback:function(e){t.$set(t.document,"update_date",e)},expression:"document.update_date"}})],1),t._v(" "),n("v-layout",{attrs:{"align-center":"","justify-center":"",row:"","fill-height":""}},[n("v-text-field",{attrs:{label:"제목",type:"text",outlined:"",readonly:""},model:{value:t.document.title,callback:function(e){t.$set(t.document,"title",e)},expression:"document.title"}})],1),t._v(" "),n("v-layout",{attrs:{"align-center":"","justify-center":"",row:"","fill-height":""}},[n("v-textarea",{attrs:{label:"내용",outlined:"",readonly:""},model:{value:t.document.content,callback:function(e){t.$set(t.document,"content",e)},expression:"document.content"}})],1),t._v(" "),n("v-layout",{staticClass:"mb-10",attrs:{"align-center":"","justify-start":"",row:"","fill-height":""}},t._l(t.document.tags,function(e,o){return n("v-chip",{key:"tag"+o,staticClass:"mr-1"},[t._v("#"+t._s(e.name))])}),1),t._v(" "),n("v-layout",{attrs:{"align-center":"","justify-start":"",row:"","fill-height":""}},t._l(t.document.photos,function(e,o){return n("v-card",{key:"photo"+o,staticClass:"mr-1",attrs:{flat:""}},[n("v-img",{attrs:{src:""+e.file_path+e.file_name,"max-width":"800","min-width":"200"}},t._l(e.photo_texts,function(e,o){return n("div",{key:"text"+o,style:"position: absolute; top: "+e.position_x+"px; left: "+e.position_y+"px;"},[t._v(t._s(e.text))])}),0)],1)}),1)],1),t._v(" "),n("v-card-actions",[n("v-spacer"),t._v(" "),n("v-btn",{attrs:{color:"red lighten-1",dark:""},on:{click:t.deleteDocument}},[n("v-icon",[t._v("delete")]),t._v("삭제")],1),t._v(" "),n("v-btn",{attrs:{color:"indigo lighten-1",dark:"",router:"",to:{name:"edit",params:{id:this.$route.params.id,document:t.document}},exact:""}},[n("v-icon",[t._v("edit")]),t._v("수정")],1),t._v(" "),n("v-btn",{attrs:{color:"blue-grey lighten-1",dark:"",router:"",to:{name:"home"},exact:""}},[n("v-icon",[t._v("list")]),t._v("목록")],1)],1)],1)],1)},staticRenderFns:[]},c=n("VU/8")(l,i,!1,null,null,null);e.default=c.exports}});
//# sourceMappingURL=1.d721af63332fe75f46e6.js.map