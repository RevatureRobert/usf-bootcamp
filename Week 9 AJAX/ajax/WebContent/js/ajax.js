/*
	what does ajax stand for?
		asynchronous javascript and xml
	what is it for?
		making http requests to gather information.
	
*/

// the url is https://pokeapi.co/api/v2/pokemon/+num

function getPk(){
	
	/*
		When it comes to ajax, there are 4 steps that we need
			to go through to make the request
			
		step 1:
			instantiate the XMLHttpRequest object. This will be our data
				retriever and will make all of our requests.		
	*/
	const xhr = new XMLHttpRequest();
	const info = document.getElementById('pkid').value;
	
	// step 2:
	//	add an event listener
	xhr.onreadystatechange = function (){
		/*
		what is the ready state?
			the state of the request
		states of the readystate:
			0 = request has not been initialized
			1 = server connection has been established
			2 = request received
			3 = request is being processed
			4 = request has been finished and the response is ready
			
		what is the status code?
			100 = informational 
			200 = OK
			300 = redirect
			400 = Client side error
			500 = server side error
		*/
		
		if(xhr.readyState === 4 && xhr.status === 200){
			const pk = JSON.parse(xhr.responseText);
			//console.log(pk);
			//console.log(xhr.responseText);
			inject(pk);
		}
	}
	
	
	//step 3:
	//	create a connection
	//		open(httpMethod, url)
	xhr.open('GET', `http://pokeapi.co/api/v2/pokemon/${info}`);
	
	
	// step 4:
	//	send the request.
	
	xhr.send();
	
	
}

document.getElementById('pkSubmit').addEventListener('click', getPkAsync);

function inject(json){
	document.getElementById('pkName').innerHTML=json.name
}


function getPkEasier(){
	const pkid = document.getElementById('pkid').value;
	fetch(`http://pokeapi.co/api/v2/pokemon/${pkid}`) // returns a promise
		.then(response => response.json())	//returns a promise
		.then(json => inject(json));
}

async function getPkAsync(){
	const pkid = document.getElementById('pkid').value;
	const fet = await fetch(`http://pokeapi.co/api/v2/pokemon/${pkid}`);
	const json = await fet.json();
	inject(json);
}





