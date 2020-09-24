async function getUser(){
	const u = await fetch('http://localhost:8080/NewWebServer/user.data');
	const json = await u.json();
	console.log(json);
	document.getElementById('username').innerHTML=json.username;
	document.getElementById('password').innerHTML=json.password;
}

function clearDom(){
	document.getElementById('username').innerHTML='';
	document.getElementById('password').innerHTML='';
}
//getUser();

document.getElementById("generator").addEventListener('click', getUser);
document.getElementById('clear').addEventListener('click', clearDom);
document.getElementById('register').addEventListener('click', async () => {
	const username = document.getElementById('name').value;
	const password = document.getElementById('pass').value;
	const user = {
		id:0,
		username,
		password
	};
	const u = await fetch('http://localhost:8080/NewWebServer/create.data', {
		method:'POST',
		body: JSON.stringify(user),
	});
	const json = await u.json();
	console.log(json);
})

