/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This relationship contains the the Z end TP names (CTP or GTP) and rep 
* resents the ends of the relationships.CcHasZEndCtps and CcHasZEndGtps. 
 @since SID_R16.5
*/ 

public  class CrossConnect  {



/**  
* Field isActive
*/
protected Boolean isActive ;




/**  
* Field aEndTpRefList
*/
protected ObjectName aEndTpRefList ;




/**  
* Field direction
*/
protected ConnectionDirection direction ;




/**  
* Field crossConnectType
*/
protected SubnetworkConnectionType crossConnectType ;




/**  
* Field isFixed
*/
protected Boolean isFixed ;




/**  
* Field connectionId
*/
protected String connectionId ;




/**  
* Field additionalInformation
*/
protected List<AttributeValuePair> additionalInformation ;




/**  
* Field zEndTpRefList
* This relationship contains the the Z end TP names (CTP or GTP) and rep 

* resents the ends of the relationships.CcHasZEndCtps and CcHasZEndGtps. 

*/
protected ObjectName zEndTpRefList ;




/**  
* Field aEndTpRefList
*/
protected TIPConnectionTerminationPoint aEndTpRefList ;




/**  
* Field aEndGtpRefList
*/
protected GroupTerminationPoint aEndGtpRefList ;




/**  
* Field zEndTpRefList
*/
protected TIPConnectionTerminationPoint zEndTpRefList ;




/**  
* Field zEndGtpRefList
*/
protected GroupTerminationPoint zEndGtpRefList ;


}