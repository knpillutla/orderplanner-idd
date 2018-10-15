package com.threedsoft.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.order.dto.responses.OrderResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class OrderShippedEvent extends WMSEvent {
	public OrderShippedEvent(OrderResourceDTO resourceDTO, String serviceName) {
		this(resourceDTO, serviceName, null);
	}

	public OrderShippedEvent(OrderResourceDTO resourceDTO, String serviceName, Map headerMap) {
		super("OrderShippedEvent", resourceDTO.getBusName(), resourceDTO.getLocnNbr(),
				resourceDTO.getCompany(), resourceDTO.getDivision(), resourceDTO.getBusUnit(),
				"Order", resourceDTO.getOrderNbr(), serviceName, resourceDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
