class UrlMappings {

  static mappings = {

    "/todos"(controller: 'todo', parseRequest: true) {
      action = [GET: 'index', POST: 'save']
    }

    "/todos/$id"(controller: 'todo', parseRequest: true) {
      action = [GET: 'show', PUT: 'update', POST: 'update', DELETE: 'delete']
      constraints {
        id matches: /\d+/
      }
    }

    "/"(view:"/index")
    "500"(view:'/error')
  }
}
