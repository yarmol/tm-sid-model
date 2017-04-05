/**
* Customer ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8CEBE701B5-content.html">Customer ABE</a> 
* The Customer ABE is the focus for the Customer domain.  Customer data  
* is the enterprise’s knowledge of the customer and accounts held by a c 
* ustomer. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_business_entity ;

/**
* Justification that a particular CustomerAccount is not required to pay 
*  taxes imposed by a taxing jurisdiction. 
 @since SID_R16.5
*/ 

public  class CustomerAccountTaxExemption  {



/**  
* Field issuingJurisdiction
* The name of the taxing jurisdiction for which taxes are exempt. 

*/
protected String issuingJurisdiction ;




/**  
* Field certificateNumber
* The identifier of a document that shows proof of exemption from taxes  

* for the taxing jurisdiction. 

*/
protected String certificateNumber ;




/**  
* Field validFor
* The period for which the exemption is valid. 

*/
protected TimePeriod validFor ;


}