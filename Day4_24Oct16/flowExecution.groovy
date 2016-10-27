String requestUser() {
	String result = System.console().readLine()
	return result
}

void createUser() {
	String user = requestUser()
	while (!isValidUser(user)) {
		println("That name is not valid. Please try again.")
		user = requestUser()
	}
	insertUserInDB(user)
}

void deleteUser() {
	String user = requestUser()
	while (!isValidUser(user)) {
		println("That name is not valid. Please try again.")
		user = requestUser()
	}
	if (existsInDB(user) ){
		deleteUserInDB(user)
	}else {
		println "That user does not exist."
	}
}

void insertUserInDB(String user) {
	// do things with DB that we will cover in later weeks
}

void deleteUserFromDB(String user) {
	// do things with DB that we will cover in later weeks
}

boolean existsInDB(String user) {
	// do things with DB that we will cover in later weeks
}

boolean isValidUser(String login) {
	boolean loginIsValid = true;
	for (int i = 0; i < login.length(); i++) {
		char c = login.charAt(i)
		if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
			loginIsValid = false
		}
	}
	return loginIsValid
}

boolean running = true
while (running) {
	println "What would you like to do?"
	println "1 - Enter a new user"
	println "2 - Delete a user"
	println "0 - Exit"
	print "> "
	String str = System.console().readLine()
	int option = Integer.parseInt(str)

	switch (option) {
		case 0: running = false
			break;
		case 1: createUser()
			break;
		case 2: deleteUser()
			break;
		default: println "Invalid option. Please try again."
	}
}