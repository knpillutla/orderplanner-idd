package com.threedsoft.order.dto.responses;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
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
public class OrderResourceDTO  extends WMSResourceDTO{
	Long id;
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String externalBatchNbr;
	String batchNbr;
	String orderNbr;
	Integer statCode;
	LocalDateTime orderDttm;
	LocalDateTime shipByDttm;
	LocalDateTime expectedDeliveryDttm;
	String deliveryType;
	boolean isGift;
	String giftMsg;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
    String delFirstName;
    String delLastName;
    String delMiddleName;
    String delAddr1;
    String delAddr2;
    String delAddr3;
    String delCity;
    String delState;
    String delCountry;
    String delZipcode;
    String delPhoneNbr;
	String shipCarrier;
	String shipService;
	String trackingNbr;
	List<OrderLineResourceDTO> orderLines = new ArrayList<>();

    public void addOrderLine(OrderLineResourceDTO orderLineDTO) {
    	orderLines.add(orderLineDTO);
    }
 
    public void removeOrderLine(OrderLineResourceDTO orderLineDTO) {
    	orderLines.remove(orderLineDTO);
    }
}
