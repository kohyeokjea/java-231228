package q_chapter16;

import q_chapter16.controller.OrderController;
import q_chapter16.model.OrderModel;
import q_chapter16.view.OrderView;

public class Main {

	public static void main(String[] args) {
		OrderView view = new OrderView();
		OrderModel model = new OrderModel();
		OrderController controller = new OrderController(model, view);
		
		controller.processOrder();

	}

}
