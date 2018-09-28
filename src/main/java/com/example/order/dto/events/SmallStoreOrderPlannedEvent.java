package com.example.order.dto.events;

import java.util.Map;

import com.example.order.dto.responses.OrderDTO;
import com.example.util.dto.events.BaseEvent;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class SmallStoreOrderPlannedEvent extends BaseEvent {
	private OrderDTO orderDTO;
	private static String EVENT_NAME = "SmallStoreOrderPlannedEvent";
	public SmallStoreOrderPlannedEvent(OrderDTO orderDTO) {
		this(orderDTO, null);
	}

	public SmallStoreOrderPlannedEvent(OrderDTO orderDTO, Map headerMap) {
		super(EVENT_NAME);
		this.orderDTO = orderDTO;
		if(headerMap != null)
			this.setHeaderMap(headerMap);
		this.addHeader("eventName", getEventName());
		this.addHeader("busName", orderDTO.getBusName());
		this.addHeader("locnNbr", orderDTO.getLocnNbr());
		this.addHeader("OrderNbr", orderDTO.getOrderNbr());
		this.addHeader("company", orderDTO.getCompany());
		this.addHeader("division", orderDTO.getDivision());
		this.addHeader("busUnit", orderDTO.getBusUnit());
	}
}