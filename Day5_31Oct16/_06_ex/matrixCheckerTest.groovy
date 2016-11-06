//groovy program to text Matrix class

Matrix matTest = new Matrix(4,4);

println("Test Symmetrical Method");
println("A 4 x 4 matrix intialised with 1's: ")
matTest.prettyPrint();
println("Is matrix symmetrical?")
println(matTest.isSymmetrical())

matTest.setElement(1,2,8)
println("Set element 2,3 to 8")
matTest.prettyPrint();
println("Is matrix still symmetrical?")
println(matTest.isSymmetrical())

println("Test Triangular Method");
str = "1,2,3,4;0,5,6,7;0,0,9,10;0,0,0,11"
matTest.setMatrix(str)
matTest.prettyPrint();
println("Is matrix triangular?")
println(matTest.isTriangular())

matTest.setElement(1,0,8)
matTest.setElement(3,0,8)
println("Set element 2,1 to 8 & 4,1 to 8")
matTest.prettyPrint();
println("Is matrix still triangular?")
println(matTest.isTriangular())
