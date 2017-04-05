/**
* Customer Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941DAE79F008C-content.html">Customer Billing Statistic ABE</a> 
* The Customer Billing Statistic ABE represents collected data derived f 
* rom CustomerBills. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_billing_statistic_business_entity ;

/**
* An aggregation of all CustomerAccount charges applied to a Product. 

Inheritance tree: |- 
 <a title="SID Models::Customer Domain::Customer Bill ABE::Customer Billing Statistic ABE::CustomerBillingStatisticBalance" href="_3E3F0EC000E941DA629600B6-content.html">SID Models::Customer Domain::Customer Bill ABE::Customer Billing Statistic ABE::CustomerBillingStatisticBalance</a> @since SID_R16.5
*/ 

public  class CustomerBillingProductChargeSumBalance extends CustomerBillingStatisticBalance {



/**  
* Field productChargeSum
* The customer account charges applied to the Product sum. 

*/
protected Money productChargeSum ;


}