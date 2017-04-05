/**
* Customer Account Balance Type ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_S.y.x.c.oGA.xE.eSD.e6.aJND.z.vZA-content.html">Customer Account Balance Type ABE</a> 
* Used for Customer Account Balance Type information. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_account_balance_abe.customer_account_balance_type_business_entity ;

/**
* CustomerAccountBalanceTypeSpec describes and defines certain type of C 
* ustomerAccountBalance. 
 @since SID_R16.5
*/ 

public  class CustomerAccountBalanceType  {



/**  
* Field ID
* A unique identifier for the CustomerAccountBalanceType. 

*/
protected String ID ;




/**  
* Field name
* Name of the CustomerAccountBalanceType. 

*/
protected String name ;




/**  
* Field description
* An explanation of the CustomerAccountBalanceType. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the CustomerAccountBalanceType is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field balanceClass
* Class of the CustomerAccountBalance, such as prepayment, deposit, bonu 

* s. 

*/
protected String balanceClass ;




/**  
* Field customerAccountBalance
*/
protected List<CustomerAccountBalance> customerAccountBalance ;


}