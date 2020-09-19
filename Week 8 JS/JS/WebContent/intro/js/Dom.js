const btnClick = eve => {
	const answer = prompt('what do you want the button to say???');
	btn1.innerHTML = answer;
}

const btn1 = document.getElementById('btn1');
btn1.addEventListener('dblclick', btnClick);


/*
	DOM Manipulation
		DOM = Document Object Model
		it is a way of using the document as an object
		It has a tree like shape, document is the root object
			with nested objects: head and body. those objects
			have nested objects: title, meta, button, div; and
			those objects can have nested objects.
	
	features
		find elements
			document.getElementsByTagName('tagName');
			document.getElementsByClassName('className');
			document.getElementById('id')
		change elements
			element.attribute = value
			element.setAttribute(attribute, value)
			element.innerHTML = value
			element.style.property = value
		add or remove elements
			document.write(text)
			document.createElement(tagName)
			element.appendChild(element)
			element.removeChild(element)
			element.replaceChild(element)

*/


const div = document.getElementById('mydiv')

const list = document.createElement('ol')

const li1 = document.createElement('li')

li1.innerHTML = 'hey there partner'

list.append(li1)

div.append(list)

const li2 = document.createElement('li')

li2.innerHTML = '<h1>i am bigger than the last one</h1>'

list.append(li2)



const raccoonDogs = [
	{
		name: 'sparky',
		age: 3,
		rideable: true,
		spotColor: 'white'
	},
	{
		name: 'Bicca',
		age: 877,
		rideable: true,
		spotColor: 'gray'
	}
]



function fetchRaccoonDogs() {
	const table = document.createElement('table');
	table.id="rdTable"
	const heading = document.createElement('thead');
	const headingRow = document.createElement('tr');
	for (let key of Object.keys(raccoonDogs[0])) {
		const th = document.createElement('th');
		th.innerHTML = key;
		headingRow.append(th);
	}
	heading.append(headingRow);
	table.append(heading);

	const body = document.createElement('tbody');
	for (let rd of raccoonDogs) {
		const row = document.createElement('tr');
		for(key of Object.keys(rd)){
			const td = document.createElement('td');
			td.innerHTML=rd[key];
			row.append(td);
		}
		body.append(row);
	}
	table.append(body);
	div.append(table);
};

btn1.addEventListener('click', () => {
	setTimeout(fetchRaccoonDogs, 3000);
})








function divAlert(eve){
	alert(`target: ${eve.target.id} ~~~~~ this: ${this.id}`);
	if(this.id=== 'div2'){
		eve.stopPropagation();  ///this will stop bubbling
	}
}

const divs = document.getElementsByTagName('div');

for(let div of divs){
	div.addEventListener('click',divAlert);
	///div.addEventListener('click',divAlert, {capture:true});
}

/*
	When an event happens on an html element, it first runs the handler
		associated with it, then its parent, and so on until it runs out.
	
	We can run event.stopPropagation() to stop bubbling. We normally do
		not want to do this though. so you must have a very good reason for it.
	
	The opposite of this is called capturing. This is where an event
		happens on an html element, it runs the handlers on its parents
		moving inward to the element that was clicked.
		
	for more info:
		https://javascript.info/bubbling-and-capturing




*/

