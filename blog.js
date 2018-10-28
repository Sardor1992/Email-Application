menu.onclick = function myFunction(){
     var x = document.getElementById("myTopNav");
     if(x.className === "top_nav"){
         x.className += " responsive";
     }else{
         x.className = "top_nav";
     }
}