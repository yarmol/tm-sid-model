/**
* Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html">Test ABE</a> 
* A test is a function performed on a product, service, or resource that 
*  results in measures being produced that reflect the functioning of th 
* e entity under test. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.test_business_entity ;

/**
*  The abstract test specification describes a product, service, or reso 
* urce test in terms of parameters to be configured and measures to be t 
* aken.  
 @since SID_R16.5
*/ 

public abstract class TestSpecification  {



/**  
* Field test
* Relationship to the test object 

*/
protected List<Test> test ;




/**  
* Field entitySpecCharUse
* The EntitySpecCharUse represents the configuration parameter(s) for th 

* e test 

*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field testSpecificationRole
* A testSpecification plays a given role 

*/
protected List<TestSpecificationRole> testSpecificationRole ;




/**  
* Field testMeasureDefinition
* A test specification contains testMeasureDefintions that define the me 

* trics to be captured as part of the test 

*/
protected List<TestMeasureDefinition> testMeasureDefinition ;




/**  
* Field name
* The name of the test specification 

*/
protected String name ;




/**  
* Field description
* The description of the test specification 

*/
protected String description ;




/**  
* Field validFor
* A time period for which the test specification is valid 

*/
protected TimePeriod validFor ;




/**  
* Field testSpecContainedBy
*/
protected TestSpecification testSpecContainedBy ;




/**  
* Field testSpecContains
*/
protected List<TestSpecification> testSpecContains ;


}