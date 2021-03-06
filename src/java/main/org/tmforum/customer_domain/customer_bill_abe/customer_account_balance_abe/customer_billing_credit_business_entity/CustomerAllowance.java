/**
* Customer Billing Credit ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9420B65450160-content.html">Customer Billing Credit ABE</a> 
* Keep track of the credit. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_account_balance_abe.customer_billing_credit_business_entity ;

/**
* Money (typically) deducted from the selling price of a Product a servi 
* ce provider as a discount or in exchange for something. An example of  
* allowance is 500 free minutes of domestic calls granted to new custome 
* rs by AllowanceProdPriceAlteration. While a customer uses the service  
* the available allowance is gradually reduced. The AvaliableCustomerAll 
* owance represents available not yet used allowance. 

Inheritance tree: |- 
 <a title="SID Models::Customer Domain::Customer Bill ABE::Customer Account Balance ABE::Customer Billing Credit ABE::CustomerBillingCredit" href="_3E3F0EC000E942146E4B0009-content.html">SID Models::Customer Domain::Customer Bill ABE::Customer Account Balance ABE::Customer Billing Credit ABE::CustomerBillingCredit</a> @since SID_R16.5
*/ 

public  class CustomerAllowance extends CustomerBillingCredit {



/**  
* Field allowanceProdPriceAlteration
*/
protected AllowanceProdPriceAlteration allowanceProdPriceAlteration ;


}