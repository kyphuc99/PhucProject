let userName = prompt("who's there?",'');
if (userName == 'Admin') {
    let pass = prompt('Password?','');
    if(pass == 'TheMaster') {
        alert('welcome!');
    } else if (pass == null) {
        alert('canceled.');
    } else {
        alert('wrong password');
    }
} else if (userName == null) {
    alert('canceled');
} else {
    alert("I don't know you");
}