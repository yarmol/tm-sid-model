/**
* Customer Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C9633A02D5-content.html">Customer Bill ABE</a> 
* The Customer Billng ABE hjndles real-time and non-real-time Call Detai 
* l Records (CDRs) and other sources of data that result in invoice item 
* s.  The Customer Bill ABE also represents the format of a bill, schedu 
* le the production of bills, customer invoicing profiles, all the finan 
* cial calculations necessary to deter¬mine the total of the bill (excep 
* t for rating and rating discounts), and credits and adjustments to bil 
* ls. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_business_entity ;

/**
* A means of communicating a CustomerBill, supported by the associated b 
* ill format. For example, post mail, email, web page. 
 @since SID_R16.5
*/ 

public  class CustomerBillPresentationMedia  {



/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field description
* A description of the presentation media. 

*/
protected String description ;




/**  
* Field customerBillFormat
*/
protected List<CustomerBillFormat> customerBillFormat ;


}