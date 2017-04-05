/**
* Customer Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941DAE79F008C-content.html">Customer Billing Statistic ABE</a> 
* The Customer Billing Statistic ABE represents collected data derived f 
* rom CustomerBills. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_billing_statistic_business_entity ;

/**
* Collected data derived from CustomerBills. It is defined by CustomerBi 
* llingStatisticSpecification. 
 @since SID_R16.5
*/ 

public abstract class CustomerBillingStatistic  {



/**  
* Field statisticForPeriod
* The period for which the statistic is calculated. 

*/
protected TimePeriod statisticForPeriod ;




/**  
* Field customerBillingStatisticBalance
*/
protected CustomerBillingStatisticBalance customerBillingStatisticBalance ;




/**  
* Field customerBillingStatisticSpec
*/
protected CustomerBillingStatisticSpec customerBillingStatisticSpec ;


}