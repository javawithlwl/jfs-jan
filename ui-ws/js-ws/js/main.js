function changeStatus(){
    let img = document.getElementById('idImg');
    if(img.src.match('bulbon')){
        img.src = 'images/pic_bulboff.gif';
    }else{
        img.src = 'images/pic_bulbon.gif';
    }
}
function showBrowserInfo(){
    let txt = "<p>User-agent header: " + navigator.userAgent + "</p>";
    document.getElementById('idShowBrowserInfo').innerHTML = txt;
}