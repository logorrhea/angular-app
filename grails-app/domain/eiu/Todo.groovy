package eiu

class Todo {

  boolean completed = false
  String title

  static constraints = {
    title nullable: false
  }
}
