"use strict";(self.webpackChunkantd_demo=self.webpackChunkantd_demo||[]).push([[866,859],{3859:function(e,n,t){t.r(n),t.d(n,{default:function(){return g}});var a=t(1413),r=t(9439),o=(t(2791),t(8687)),i=t(9973),l=t(7586),s=t(1095),u=t(6161),c=t(586),d=t(6106),h=t(914),f=t(177),m=t(3707),p=t(7689),j=t(184),x={handleLogin:i.e6},g=(0,o.$j)((function(e){return{authInfo:(0,l.Dr)(e),loggedIn:(0,l.gs)(e)}}),x)((function(e){var n=e.handleLogin,t=(e.authInfo,e.loggedIn),o=s.Z.useForm(),i=(0,r.Z)(o,1)[0],l=u.Z.Title;return t?(0,j.jsx)(p.Fg,{push:!0,to:"/home/dashboard"}):(0,j.jsx)(c.Z,{className:"login-page",children:(0,j.jsx)(d.Z,{children:(0,j.jsx)(h.Z,{span:6,offset:2,children:(0,j.jsxs)(s.Z,(0,a.Z)((0,a.Z)({},{labelCol:{span:6},wrapperCol:{span:19}}),{},{form:i,name:"login-form",onFinish:function(){console.log("On finish",i)},className:"login-form",autoComplete:"off",children:[(0,j.jsx)(l,{level:3,children:"Login"}),(0,j.jsx)(s.Z.Item,{label:"Username",name:"username",rules:[{required:!0,message:"Username is required"}],children:(0,j.jsx)(f.Z,{placeholder:"Username"})}),(0,j.jsx)(s.Z.Item,{label:"Password",name:"password",rules:[{required:!0,message:"Password is required"}],children:(0,j.jsx)(f.Z.Password,{placeholder:"Password"})}),(0,j.jsx)(s.Z.Item,(0,a.Z)((0,a.Z)({},{wrapperCol:{offset:18,span:1}}),{},{children:(0,j.jsx)(m.Z,{type:"primary",onClick:function(){i.validateFields().then((function(e){n({data:e})})).catch((function(e){}))},children:"Submit"})}))]}))})})})}))},5006:function(e,n,t){t.d(n,{Z:function(){return y}});var a=t(4942),r=t(9439),o=t(2791),i=t(1095),l=t(914),s=t(177),u=t(3707),c=t(763),d=t(3734),h=t(7586),f=t(8687),m=t(6155),p=t(2695),j=t(184),x={handleInitSelect:m.NL},g=(0,f.$j)((function(e){return{authInfo:(0,h.Dr)(e),selectResult:(0,p.fl)(e)}}),x)((function(e){var n=e.onChange,t=e.handleInitSelect,a=e.init,r=e.name,i=e.authInfo,l=e.selectResult,s=e.value;return console.log(s),(0,o.useEffect)((function(){t({api:a,token:i.token,name:r})}),[r]),(0,j.jsx)(d.Z,{style:{width:"100%"},onChange:n,value:s&&s.id?s.id:s,options:l[r]})})),Z={handleInitSelect:m.NL},I=(0,f.$j)((function(e){return{authInfo:(0,h.Dr)(e),selectResult:(0,p.fl)(e)}}),Z)((function(e){var n=e.onChange,t=e.handleInitSelect,a=e.init,r=e.name,i=e.authInfo,l=e.selectResult,s=e.value;return console.log(a),(0,o.useEffect)((function(){t({api:a,token:i.token,name:r})}),[r]),(0,j.jsx)(d.Z,{mode:"multiple",style:{width:"100%"},onChange:n,value:s&&s.id?s.id:s,options:l[r]})})),v=function(e){var n=e.type,t=e.element,a=e.actions,r=e.onChange,o=e.value;switch(n.toUpperCase()){case"TEXT":return(0,j.jsx)(s.Z,{placeholder:t.props.placeholder,onChange:r,value:o});case"SUBMIT":return(0,j.jsx)(u.Z,{type:"primary",htmlType:"submit",children:t.props.label});case"BUTTON":return console.log(a,t),(0,j.jsx)(u.Z,{onClick:a[t.props.action],children:t.props.label});case"SELECT":return(0,j.jsx)(g,{name:t.name,init:t.onSearch,onChange:r,value:o});case"MULTI_SELECT":return(0,j.jsx)(I,{name:t.name,init:t.onSearch,onChange:r,value:o});default:return n}},y=function(e){var n=e.meta,t=e.actions,o=e.initialValues,s=i.Z.useForm(),u=(0,r.Z)(s,1)[0];if(void 0===n||void 0===n.attributes)return(0,j.jsx)(j.Fragment,{});return(0,j.jsx)(l.Z,{span:24,children:(0,j.jsx)(i.Z,{form:u,onFinish:function(e){t.submitAction(e)},labelCol:{span:6},layout:n.inline?"inline":"horizontal",initialValues:o,children:n.attributes.map((function(e,n){e.type.toUpperCase();var r=e.span/24*100,o=[];if(e.validations){var l=e.validations,s=(0,c.template)(l.message)((0,a.Z)({},e.name,e.props.label));!0===l.isRequired&&o.push({required:!0,message:s})}return(0,j.jsx)(i.Z.Item,{wrapperCol:{offset:"".concat(e.offset)},rules:o,style:{width:"calc(".concat(r,"%)")},name:e.name,label:"SUBMIT"===e.type||"button"===e.type?null:e.props.label,children:(0,j.jsx)(v,{type:e.type,element:e,actions:t})},n)}))})})}},4866:function(e,n,t){t.r(n),t.d(n,{default:function(){return D}});var a=t(2791),r=t(586),o=t(7083),i=t(3613),l=t(6199),s=t(7586),u=t(8687),c=t(6014),d=t(6916),h=(0,d.P1)((function(e){return e.ui.menus}),(function(e){return e})),f=(0,d.P1)((function(e){return e.ui.pageTitle}),(function(e){return e})),m=t(2429),p=t(7689),j=t(184),x={handleLoadMenus:m.Y_,handleMenuClicked:m.Iw},g=(0,u.$j)((function(e){var n=(0,s.Dr)(e),t=h(e);return console.log(t),{authInfo:n,menus:t}}),x)((function(e){var n=e.menus,t=e.authInfo,r=e.handleLoadMenus,i=e.handleMenuClicked,l=(0,p.s0)();(0,a.useEffect)((function(){r({id:t.userId,certificate:t.token})}),[]);return(0,j.jsx)(o.Z,{tip:"Loading Menus",spinning:0===n.length,children:(0,j.jsx)(c.Z,{onClick:function(e){i({title:e.item.props.title}),l(e.item.props.path)},theme:"light",defaultSelectedKeys:["1"],mode:"inline",items:n})})})),Z=t(3859),I=t(6155),v=t(9291),y=t(2695),b=t(6106),C=t(914),M=t(5006),S={handleSearch:I.eD,handleLoadFormMeta:I.yW,handleLoadSearchMeta:I.$o,handleInitForm:I.mT},w=(0,u.$j)((function(e){return{authInfo:(0,s.Dr)(e),formMeta:(0,y.Cf)(e),searchMeta:(0,y.ll)(e),searchResult:(0,y.sy)(e),initialValues:(0,y.w1)(e)}}),S)((function(e){var n=e.authInfo,t=e.formMeta,r=(e.searchMeta,e.handleSearch,e.handleLoadFormMeta,e.handleLoadSearchMeta,e.searchResult,e.handleInitForm),o=e.initialValues,i=(0,p.UO)();return console.log(i),(0,a.useEffect)((function(){r({code:"edit-".concat(i.code),id:i.id,token:n.token})}),[i.id,i.code]),(0,j.jsxs)(b.Z,{gutter:[16,16],children:[(0,j.jsx)(C.Z,{span:24,children:(0,j.jsx)(v.Z,{title:t.title})}),(0,j.jsx)(C.Z,{span:24,children:(0,j.jsx)(M.Z,{meta:t,actions:{submitAction:function(e){return console.log(e)}},initialValues:o})})]})})),L={handleSearch:I.eD,handleLoadFormMeta:I.yW,handleLoadSearchMeta:I.$o,handleInitForm:I.mT},k=(0,u.$j)((function(e){return{authInfo:(0,s.Dr)(e),formMeta:(0,y.Cf)(e),searchMeta:(0,y.ll)(e),searchResult:(0,y.sy)(e),initialValues:(0,y.w1)(e)}}),L)((function(e){var n=e.authInfo,t=e.formMeta,r=(e.searchMeta,e.handleSearch,e.handleLoadFormMeta),o=(e.handleLoadSearchMeta,e.searchResult,e.handleInitForm,e.initialValues),i=(0,p.UO)();return(0,a.useEffect)((function(){r({code:"add-".concat(i.code),token:n.token})}),[i.id,i.code]),(0,j.jsxs)(b.Z,{gutter:[16,16],children:[(0,j.jsx)(C.Z,{span:24,children:(0,j.jsx)(v.Z,{title:t.title})}),(0,j.jsx)(C.Z,{span:24,children:(0,j.jsx)(M.Z,{meta:t,actions:{submitAction:function(e){return console.log(e)}},initialValues:o})})]})})),T=[{path:"/home/dashboard",name:"Dashboard",element:a.lazy((function(){return t.e(484).then(t.bind(t,3484))}))},{path:"/home/reports/effort",name:"Effort Report",element:a.lazy((function(){return Promise.all([t.e(857),t.e(666),t.e(610),t.e(363)]).then(t.bind(t,3363))}))},{path:"/home/reports/attendance",name:"Attendance Report",element:a.lazy((function(){return Promise.all([t.e(857),t.e(666),t.e(610),t.e(414)]).then(t.bind(t,4414))}))},{path:"/home/expense/claim",name:"Expense Claim",element:a.lazy((function(){return Promise.all([t.e(857),t.e(666),t.e(585)]).then(t.bind(t,9585))}))},{path:"/portlet",name:"Portlet",element:a.lazy((function(){return Promise.resolve().then(t.bind(t,1867))}))},{path:"/home/:code/search",name:"Search Stores",element:a.lazy((function(){return Promise.all([t.e(857),t.e(11)]).then(t.bind(t,11))}))},{path:"/admin/:code/edit/:id",name:"Search Stores",element:w},{path:"/admin/:code/new",name:"New",element:k},{path:"/login",name:"Login",element:Z.default}],P=t(6161),F=t(7504),E={handleLoadProfileInfo:t(9973).zk},R=(0,u.$j)((function(e){return{authInfo:(0,s.Dr)(e),profileInfo:(0,s.Rs)(e),pageTitle:f(e)}}),E)((function(e){var n=e.authInfo,t=e.profileInfo,r=e.handleLoadProfileInfo;e.pageTitle;(0,a.useEffect)((function(){r({certificate:n.token,id:n.userId})}),[]);var o=P.Z.Title;return(0,j.jsx)(b.Z,{justify:"space-between",style:{height:"100%"},children:(0,j.jsx)(C.Z,{span:4,offset:20,children:(0,j.jsx)(F.Z,{loading:null===t,size:"small",paragraph:{rows:0},children:(0,j.jsx)(o,{level:5,children:null===t?"":t.user.name})})})})})),D=(0,u.$j)((function(e){return{authInfo:(0,s.Dr)(e)}}),{})((function(e){e.authInfo;return(0,j.jsxs)(r.Z,{style:{minHeight:"100vh"},children:[(0,j.jsxs)(l.Z,{width:172,children:[(0,j.jsx)("div",{style:{height:"60px",color:"#fff",padding:"20px"},children:"LOGO"}),(0,j.jsx)(g,{})]}),(0,j.jsxs)(r.Z,{className:"site-layout",children:[(0,j.jsx)(i.h4,{children:(0,j.jsx)(R,{})}),(0,j.jsx)(i.VY,{className:"content-layout",children:(0,j.jsx)(a.Suspense,{fallback:(0,j.jsx)(o.Z,{}),children:(0,j.jsxs)(p.Z5,{children:[T.map((function(e,n){return e.element&&(0,j.jsx)(p.AW,{path:e.path,exact:e.exact,name:e.name,element:(0,j.jsx)(e.element,{})},n)})),(0,j.jsx)(p.AW,{path:"/",element:(0,j.jsx)(p.Fg,{to:"dashboard",replace:!0})})]})})})]})]})}))},2695:function(e,n,t){t.d(n,{Cf:function(){return r},fl:function(){return l},ll:function(){return o},sy:function(){return i},w1:function(){return s}});var a=t(6916),r=(0,a.P1)((function(e){return e.common.formMeta}),(function(e){return e})),o=(0,a.P1)((function(e){return e.common.searchMeta}),(function(e){return e})),i=(0,a.P1)((function(e){return e.common.searchResults}),(function(e){return e})),l=(0,a.P1)((function(e){return e.common.selectResult}),(function(e){return e})),s=(0,a.P1)((function(e){return e.common.formInitValues}),(function(e){return e}))},9291:function(e,n,t){t(2791);var a=t(6161),r=t(6534),o=t(1333),i=t(184);n.Z=function(e){var n=e.title,t=e.subTitle;a.Z.Title;return(0,i.jsxs)(i.Fragment,{children:[(0,i.jsx)(r.Z,{style:{paddingTop:0,paddingBottom:0},title:n,subTitle:t}),(0,i.jsx)(o.Z,{style:{paddingBottom:0,marginTop:0,backgroundColor:"#9B51E0"}})]})}}}]);
//# sourceMappingURL=866.0c7eeec4.chunk.js.map