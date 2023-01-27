let index = {
   init: function() {
      $("#register-btn-save").on("click", () => {
         this.save();
      });
      $("#register-btn-update").on("click", () => {
         this.update();
      });
      $("#register-btn-delete").on("click", () => {
         this.delete();
      });
  },
  save: function() {
      let data = {
         userid: $("#userid").val(),
         username: $("#username").val(),
         email: $("#email").val(),
         password: $("#password").val()
      };
      $.ajax({
            type: "POST",
            url: "/auth/joinProc",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
         }).done(function(data) {
	console.log(data);
           alert("회원가입 성공");
           location.href = "/";
         }).fail(function(error) {
            alert(JSON.stringify(error));
         });
	},
	update: function(){
		let data={
			userid: $("#userid").val(),
			username: $("username").val(),
			password: $("#password").val(),
			email: $("#email").val(),
			createDate: $("#createDate").val()
		};
		console.log(userid);
		console.log(email);
		$.ajax({ 
			type:"PUT",
			url:"/userUpdate",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("수정이 완료되었습니다.");
			location.href="/";
			
			//응답이 정상
		}).fail(function(error){

			alert("회원수정이 완료되었습니다.");
			location.href="/  ";
			
			//응답이 비정상
		});
	},
	delete: function(){
		//alert('user의 delete 함수 호출됨');
		let id=$("#id").val();
		$.ajax({
			type:"DELETE",
			url:"/delete/"+id,
			
			dataType:"json" //자동으로 변환해주기 때문에 생략 가능
			//응답의 결과가 문자열이 아닌 json으로 변환
		}).done(function(resp){
			alert("삭제되었습니다");
			location.href="/";
			//응답이 정상
		}).fail(function(error){
			alert(JSON.stringify(error));
			//응답이 비정상
		});
	},

}
index.init();

/*유효성검사*/

function login_check(){
	let userid=document.getElementById(userid);
	let password=document.getElementById(password);
	if(userid.value==""){
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}else if(password.value==""){
		alert("비밀번호를 입력하세요")
	}else{
		alert("로그인 성공");
		submit();
	}
	
};
