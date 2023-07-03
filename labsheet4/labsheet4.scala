import scala.io.StdIn

object question1 {

    def interestperyear(amount : Float) : Float = {
        if(amount<20000){
            amount*0.02f
        }else if(amount<200000){
            amount*0.04f
        }else if(amount<20000000){
            amount*0.035f
        }else{
            amount*0.065f
        }
    }

    def main(args: Array[String]) = {
        print("Enter the Amount deposited :- ")
        val amount : Float = StdIn.readFloat()
        println("The interest per year :- " + interestperyear(amount))
    }
}

object question2 {
    def matching(input : Int) = {
        if(input<0){
            println("Negative Number.")
        }else if(input == 0){
            println("0 is Entered.")
        }else if(input%2==1){
            println("Number is Odd.")
        }else{
            println("Number is Even.")
        }
    }

    def main(args : Array[String]) = {
        matching(args(0).toInt)
    }
}

object question3 {
    def toUpper(str : String ) : String = {
        str.toUpperCase()
    }

    def toLower(str : String ) : String = {
        str.toLowerCase()
    }

    def formatNames(name : String)(function : String => String) : String = {
        function(name)
    }

    def main(args : Array[String]) = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        for(name <- names){
            val uppercaseName = formatNames(name)(toUpper)
            val lowercaseName = formatNames(name)(toLower)
            println(uppercaseName)
            println(lowercaseName)
            println("")
        }
    }
}