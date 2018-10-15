package com.threedsoft.order.dto.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.order.dto.requests.OrderFulfillmentRequestDTO;
import com.threedsoft.util.dto.WMSResourceDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class OrderFulfillmentResourceDTO  extends WMSResourceDTO{
	String busName;
	Integer locnNbr;
	String busUnit;
	String company;
	String division;
	String transName;
	String source;
	String hostName;
	String batchNbr;
	String userId;
	List<Long> orderIdList;
	List<String> orderNbrList;
	Integer numOfOrders;
	String orderSelectionOption; // by area/zone/aisle/pick density/deliveryType(prioriry vs non priority orders)/order date time/ship date time
	String printOption; //byOrder, byPickPathSequence (will not be grouped by order), delivery type(express orders etc)
	List<OrderResourceDTO> successList;
	List<Object> failureList;
	
	public OrderFulfillmentResourceDTO(OrderFulfillmentRequestDTO req) {
		this.busName = req.getBusName();
		this.locnNbr = req.getLocnNbr();
		this.busUnit = req.getBusUnit();
		this.company = req.getCompany();
		this.division = req.getDivision();
		this.transName = req.getTransName();
		this.source = req.getSource();
		this.hostName = req.getHostName();
		this.userId = req.getUserId();
		this.orderIdList = req.getOrderIdList();
		this.orderNbrList = req.getOrderNbrList();
		this.numOfOrders = req.getNumOfOrders();
		this.orderSelectionOption = req.getOrderSelectionOption();
		this.printOption = req.getPrintOption();
	}

}