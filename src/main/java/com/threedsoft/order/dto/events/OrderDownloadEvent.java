package com.threedsoft.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.order.dto.requests.OrderCreationRequestDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class OrderDownloadEvent extends WMSEvent {
	public OrderDownloadEvent(OrderCreationRequestDTO req, String serviceName) {
		this(req, serviceName, null);
	}

	public OrderDownloadEvent(OrderCreationRequestDTO req, String serviceName, Map headerMap) {
		super("OrderDownloadEvent", req.getBusName(), req.getLocnNbr(),
				req.getCompany(), req.getDivision(), req.getBusUnit(),
				"Order", req.getOrderNbr(), serviceName, req);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
