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
* A billing time period. It can be recurring (for example, a week, a mon 
* th, a quarter of year, a year) or custom (in this case additional busi 
* ness entities to describe custom dates would be needed). 
 @since SID_R16.5
*/ 

public  class BillingPeriod  {



/**  
* Field name
* A short descriptive name such as "week", "month" and "quarter of a yea 

* r".</br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail the semantics of this component. 

*/
protected String description ;




/**  
* Field customerBillingCycleSpecification
*/
protected List<CustomerBillingCycleSpecification> customerBillingCycleSpecification ;


}