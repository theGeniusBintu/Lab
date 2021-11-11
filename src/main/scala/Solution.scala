object Solution {

  def main(args: Array[String]): Unit = {

    val dateOne = convertStringToDate("12/08/94")
    val dateTwo = convertStringToDate("12/11/22")
    val dateThree = convertStringToDate("1/11/17")
    println(dateOne)
    println(dateTwo)
    println(dateThree)

  }

  def convertStringToDate(stringDate: String): String = {
    val date = stringDate.split("/")
    var day = date(0)
    var month = date(1)
    var year = date(2)

    if (day.endsWith("1") && day != "11") {
      day += "st"
    } else if (day.endsWith("2") && day != "12") {
      day += "nd"
    } else if (day.endsWith("3") && day != "13") {
      day += "3rd"
    } else {
      day += "th"
    }

    month match {
      case "01" => month = "January"
      case "02" => month = "February"
      case "03" => month = "March"
      case "04" => month = "April"
      case "05" => month = "May"
      case "06" => month = "June"
      case "07" => month = "July"
      case "08" => month = "August"
      case "09" => month = "September"
      case "10" => month = "October"
      case "11" => month = "November"
      case "12" => month = "December"
    }

    if (year > "21") {
      year = "19" + year
    } else {
      year = "20" + year
    }

    s"$day $month $year"
  }

}

def extract(passfile : String): Unit ={
    val break = raw"(.*):(.*):(.*):(.*):(.*):(.*):(.*)".r
    val break(username,password,userid,groupid,description,homedir,shell) = passfile
    println(s"username: $username")
    println(s"username: $password")
    println(s"username: $userid")
    println(s"username: $groupid")
    println(s"username: $description")
    println(s"username: $homedir")
    println(s"username: $shell")


  /*
  Pattern pattern = new Pattern (raw"(?<user_id>.*):(?<password>.*):
  res = pattern.match(string)
   */
}
