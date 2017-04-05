/**
* IP Detail Record ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E947C270490196-content.html">IP Detail Record ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.ip_detail_record_business_entity ;

/**
* null 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Usage ABE::IP Detail Record ABE::IPDetailRecord" href="_3E3F0EC000E94421CDDB02AB-content.html">SID Models::Common Business Entities Domain::Usage ABE::IP Detail Record ABE::IPDetailRecord</a> |- 
 SID Models::Resource Domain::Resource Usage ABE::ResourceUsage |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public  class PublicWANAccessUsageEntity extends IPDetailRecord,ResourceUsage,Usage {



/**  
* Field sessionID
*/
protected String sessionID ;




/**  
* Field paymentType
*/
protected String paymentType ;




/**  
* Field chargeableUnit
*/
protected String chargeableUnit ;




/**  
* Field chargeableQuantity
*/
protected Quantity chargeableQuantity ;




/**  
* Field inputOctets
*/
protected Integer inputOctets ;




/**  
* Field outputOctets
*/
protected Integer outputOctets ;




/**  
* Field class
*/
protected String class ;




/**  
* Field GMTSessionStartDateTime
*/
protected Object GMTSessionStartDateTime ;




/**  
* Field GMTSessionEndDateTime
*/
protected Object GMTSessionEndDateTime ;




/**  
* Field sessionTerminationCause
*/
protected String sessionTerminationCause ;


}