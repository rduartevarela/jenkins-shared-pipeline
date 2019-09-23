def call(Map config) {

	if(config.currentbuild%2 == 0){
		echo "Hello World: ${config.name} "
	} else {
		echo "Hello World: ${config.surname}"
	}

}