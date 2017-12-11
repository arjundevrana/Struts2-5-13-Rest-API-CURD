package com.nic.actions;

import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.apache.struts2.rest.RestActionSupport;

import com.nic.models.Order;
import com.nic.service.OrdersService;
import com.opensymphony.xwork2.ModelDriven;

public class OrderController extends RestActionSupport implements ModelDriven<Object> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 488849737358292987L;

	private static final Logger log = LogManager.getLogger(OrderController.class);

    private Order model = new Order();
    private String id;
    private Collection<Order> list = null;
    private OrdersService ordersService = new OrdersService();

    // GET /data/order/1
    public HttpHeaders show() {
        return new DefaultHttpHeaders("show");
    }

    // GET /data/order
    public HttpHeaders index() {
        list = ordersService.getAll();
        return new DefaultHttpHeaders("index")
        		.disableCaching();
    }

    // DELETE /data/order/1
    public String destroy() {
        log.debug("Delete order with id: {}", id);

        // To demonstrate exception handling we throw an exception when someone tries to delete an order
        if(id == null) {
            throw new RuntimeException(getText("exception.operation.not.supported"));
        }

        ordersService.remove(id);
        return "success";
    }

    // POST /data/order
    public HttpHeaders create() {
        log.debug("Create new order: {}", model);
        ordersService.save(model);
        return new DefaultHttpHeaders("success")
            .setLocationId(model.getItemId());
    }

    // PUT /data/order/1
    public String update() {
        log.debug("Update order: {}", model);
        ordersService.save(model);
        return "success";
    }

    public void setId(String id) {
        if (id != null) {
            this.model = ordersService.get(id);
        }
        this.id = id;
    }
    
    public Object getModel() {
        if(list != null) {
            return list;
        } else {
            if(model == null) {
                model = new Order();
            }
            return model;
        }
    }
}
