$(function() {
  $('#alert').click(function() {
	  //window.alert('アラートの表示');
	  var num = $("#num").val();
	  var flg = typeof num;  
	  //return "test";
  });
  
  $('#ajax').click(function() {
	  $.ajax({
	      type : "POST",
	      url : "/ajax",
	      data : {
	          inputNum: $("#num").val()
	      },
	      dataType : "html",
	      success : function(data) {
	    	  window.alert(data);
	  　　  },
	      error : function(XMLHttpRequest, status, errorThrown) {
	    	  console.log(XMLHttpRequest);
	            console.log(status);
	            console.log(errorThrown);
	    	  window.alert("error");
	      }
	  });
  });
  
  
  
});