/**
* Product Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_4B-3.wFNYE.eS.pOYRNT99.oU.w-content.html">Product Test ABE</a> 
* A product test is a function performed on a product  that results in m 
* easures being produced that reflect the functioning of the entity unde 
* r test. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_test_business_entity ;

/**
* An entity that exists for a controlled test invocation on a product. T 
* he product test is executed according to a schedule. and contains prod 
* uct test configuration parameters that are to be applied at execution  
* time, and product test measures that result. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Test ABE::Test @since SID_R16.5
*/ 

public  class ProductTest extends Test {



/**  
* Field product
*/
protected Product product ;


}