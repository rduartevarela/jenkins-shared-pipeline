def call(Map config) {

	if(config.curretnbuild%2 == 0){
		echo "Hello World: ${config.name} "
	} else {
		echo "Hello World: ${config.surname}"
	}

}