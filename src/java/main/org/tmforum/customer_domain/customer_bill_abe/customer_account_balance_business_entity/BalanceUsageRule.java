/**
* Customer Account Balance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kL.cJ0L.iGE.eOK5.t.kK.x.h3QZ.g-content.html">Customer Account Balance ABE</a> 
* Used to manage account balance information. Balance (or balances) repr 
* esents an amount, usually with some monetary value, usually an aggrega 
* tion, that indicates an aspect of liability (often financial) between  
* the service provider and the account holder (usually a customer). This 
*  amount can be monetary amount, or non-monetary (such as free minutes, 
*  or amount of loyalty points), can represent credit that the CSP holds 
*  for the customer (for example pre-paid balance) or debt that the cust 
* omer owes the CSP (as is the normal case for post-paid A/R balance). R 
* elated tightly with customer payment and other ABEs especially in char 
* ing domain. It is intended to support a converged model applicable for 
*  both prepaid and postpaid cases.  
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_account_balance_business_entity ;

/**
* Balance-level rule information constraining the application of Custome 
* rAccountBalance. It could describe the sharing rule, by which Customer 
* AccountBalance could be shared between different kinds of FinancialCha 
* rge which is related to different customer’s product charge. It could  
* emphasize associated CustomerAccountBalance is only applicable for cer 
* tain usage, for example only applicable for local phone call or domest 
* ic flow or intra-PLMN SMS.  BalanceUsageRule also includes priority an 
* d other kinds of rules limits the application of CustomerAccountBalanc 
* e. 
 @since SID_R16.5
*/ 

public  class BalanceUsageRule  {



/**  
* Field ID
* A unique identifier for the BalanceUsageRule. 

*/
protected String ID ;




/**  
* Field description
* An explanation of the BalanceUsageRule. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the rule is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field customerAccountBalance
*/
protected CustomerAccountBalance customerAccountBalance ;




/**  
* Field financialChargeSpec
*/
protected List<FinancialChargeSpec> financialChargeSpec ;


}