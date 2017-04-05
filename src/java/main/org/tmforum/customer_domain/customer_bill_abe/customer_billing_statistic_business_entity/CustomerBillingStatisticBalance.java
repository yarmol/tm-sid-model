/**
* Customer Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941DAE79F008C-content.html">Customer Billing Statistic ABE</a> 
* The Customer Billing Statistic ABE represents collected data derived f 
* rom CustomerBills. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_billing_statistic_business_entity ;

/**
* The balance of collected statistical data. 
 @since SID_R16.5
*/ 

public abstract class CustomerBillingStatisticBalance  {



/**  
* Field validFor
* The period for which the balance is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field customerBillingStatistic
*/
protected CustomerBillingStatistic customerBillingStatistic ;


}