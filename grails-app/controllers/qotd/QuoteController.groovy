package qotd

class QuoteController {

    def index() {
		redirect(action: home)
	}
	
	def home = {
		render "<h1>Real Preogrammers do not eat Quiche</h1>"
	}
	
	def random = {
		def staticAuthor = "Anonymous"
		def staticContent = "Real Preogrammers do not eat Quiche"
		[ author: staticAuthor, content: staticContent]
	}
}
