<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<a href="../home.do">홈</a>
 <div class="container">
     <div class="input-form-backgroud row">
      <div class="input-form col-md-12 mx-auto">       
        <form class="validation-form" method="post" action="adminSignup.do" novalidate >
      
           <div class="row">              
	         <div class="mb-3">
	            <label for="userId">아이디</label>
	            <input type="text" class="form-control" name="adminId"
	            		pattern="[a-zA-Z0-9]{5,11}" 
	            		placeholder="영문 대/소문자 + 숫자 5~11자" required>
	            <div class="invalid-feedback">
	              
	            </div>
	          </div>
<!-- 	            pattern="[a-zA-Z0-9]{8,15}"  -->
	          
	          <div class="mb-3">
	            <label for="pass">비밀번호</label>
	            <input type="password"  class="form-control" name="adminPw" 
	             pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,15}$"
	             placeholder="대문자, 소문자, 특수문자, 숫자 포함 8~15자" required 
	             >
	            <div class="invalid-feedback">
	              비밀번호를 형식에 맞게 입력해주세요.
	            </div>
	          </div>  
	          
	          <!--           <div class="mb-3">
	            <label for="passChk">비밀번호 재입력</label>
	            <input type="text"  class="form-control" name="member_passChk" 
	            pattern="[a-zA-Z0-9]{8,15}" placeholder="영문,숫자 8~15자" required>
	           <div class="invalid-feedback">
	              비밀번호가 일치하지 않습니다.
	            </div> 
	          </div>  -->  
	          
	           <div class="mb-3">
	              <label for="name">이름</label>
	              <input type="text" class="form-control" name="adminName"
	              pattern="[가-힣]|[a-zA-Z]{3,7}" placeholder="예) 홍길동 " required
	               />
	              <div class="invalid-feedback">
	                이름을 형식에 맞게 입력해주세요.(한글 3~7자)
	              </div>
	            </div>  
	          
	
	          <hr class="mb-4">
	          <div class="custom-control custom-checkbox">
	            <input type="checkbox" class="custom-control-input" id="aggrement" required>
	            <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
	          </div>
	          <div class="mb-4">
	          <input type="hidden" name="memberType" value="1" /> 
	           <button class="btn btn-dark btn-lg btn-block" type="submit">가입 완료</button>
          	 </div> 
	        </div>
	        
	      </form>
	      </div>	   
    </div>  
</div> 

  <script >   
       const forms = document.getElementsByClassName('validation-form');

      Array.prototype.filter.call(forms, (form) => {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }

          form.classList.add('was-validated');
        }, false);
      }); 
    
  </script>