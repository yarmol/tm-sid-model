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
* An abstract entity that exists for a controlled test invocation on a p 
* roduct, service, or resource. The test is executed according to a sche 
* dule. and contains configuration parameters that are to be applied at  
* execution time, and measures that result.  
 @since SID_R16.5
*/ 

public abstract class Test  {



/**  
* Field testSpecification
* The test specification associated to the test 

*/
protected TestSpecification testSpecification ;




/**  
* Field characteristicValue
* The characteristic value represents the values given to the test confi 

* guration parameters, modeled as EntitySpecCharUse 

*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field testMeasure
* A test measure represents a value collected during the execution of a  

* test for a particular metricDefMeasure 

*/
protected List<TestMeasure> testMeasure ;




/**  
* Field metricMeasurementJob
* The actual measurement job responsible for execution of the test 

*/
protected MetricMeasurementJob metricMeasurementJob ;




/**  
* Field name
* The name of the test 

*/
protected String name ;




/**  
* Field description
* The description of the test 

*/
protected String description ;




/**  
* Field mode
* An indication of whether the test is running in "PROACTIVE" or "ONDEMA 

* ND" mode 

*/
protected TestMode mode ;




/**  
* Field adminState
* The administrative state of the test may be "LOCKED", "UNLOCKED" 

*/
protected AdministrativeState adminState ;




/**  
* Field state
* The actual state the test is in 

*/
protected TestState state ;


}