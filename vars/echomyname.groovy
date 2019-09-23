def call(String name, String surname, int curretnbuild) {

	if(curretnbuild%2 == 0){
		echo "Hello World: ${name} "
	} else {
		echo "Hello World: ${surname}"
	}

}