package controllers;

import java.util.List;

import javax.inject.Inject;

import controllers.util.DiscoDto;
import models.Disco;
import play.api.mvc.Flash;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class DiscoController extends Controller {

	private final FormFactory formFactory;
	private final MessagesApi messagesApi;

	@Inject
	public DiscoController(FormFactory f, MessagesApi m) {
		formFactory = f;
		messagesApi = m;
	}

	public Result index() {
		List<Disco> discos = Disco.db().find(Disco.class).findList();

		return ok(views.html.discos.render(discos));
	}

	public Result criar(Http.Request request) {

		DiscoDto d = new DiscoDto();

		Form<DiscoDto> form = formFactory.form(DiscoDto.class).fill(d);

		return ok(views.html.discoNovo.render(form, messagesApi.preferred(request)));
	}

	public Result salvar(Http.Request request) {

		Form<DiscoDto> form = formFactory.form(DiscoDto.class).bindFromRequest(request);

		if (form.hasErrors()) {
			return badRequest("erro");
		}

		Disco d = new Disco(form.get());
		d.save();
		
		request.flash().adding("sucesso", "cadastro efetuado!");

		return redirect(routes.DiscoController.index());
	}

}
