
// // package com.example.demo;
// // import com.example.demo.model.RuleResult;
// // import com.example.demo.model.RuleStatus;
// // import com.example.demo.service.PolicyRuleService;

// // import org.junit.jupiter.api.Test;
// // import java.time.LocalDate;

// // import static org.junit.jupiter.api.Assertions.*;

// // class EligibilityServiceTest {

// //     @Test
// //     void shouldBeEligibleWhenExactly24MonthsCompleted() {

// //         LocalDate startDate = LocalDate.of(2024, 1, 15);
// //         LocalDate requestDate = LocalDate.of(2026, 1, 15);
        
// //         PolicyRuleService service=new PolicyRuleService();
// //         RuleResult result=service.checkWaitingPeriod(startDate,requestDate);
// //         assertequals(RuleStatus.MET,result.getStatus());

// //         // Expected: Eligible
// //     }

// //     @Test
// //     void shouldNotBeEligibleWhenLessThan24MonthsCompleted() {

// //         LocalDate startDate = LocalDate.of(2024, 1, 15);
// //         LocalDate requestDate = LocalDate.of(2026, 1, 14);
       
// //        PolicyRuleService service=new PolicyRuleService();
// //         RuleResult result=service.checkWaitingPeriod(startDate,requestDate);
// //         assertequals(RuleStatus.MET,result.getStatus());
// //         // Expected: Not eligible
// //     }

// //     @Test
// //     void shouldBeEligibleWhenMoreThan24MonthsCompleted() {

// //         LocalDate startDate = LocalDate.of(2024, 1, 15);
// //         LocalDate requestDate = LocalDate.of(2026, 3, 15);
      
// //       PolicyRuleService service=new PolicyRuleService();
// //         RuleResult result=service.checkWaitingPeriod(startDate,requestDate);
// //         assertequals(RuleStatus.MET,result.getStatus());
// //         // Expected: Eligible
// //     }

// //     @Test
// //     void shouldNotBeEligibleWhenOnly23MonthsCompleted() {

// //         LocalDate startDate = LocalDate.of(2024, 1, 15);
// //         LocalDate requestDate = LocalDate.of(2025, 12, 15);
       
// //        PolicyRuleService service=new PolicyRuleService();
// //         RuleResult result=service.checkWaitingPeriod(startDate,requestDate);
// //         assertequals(RuleStatus.MET,result.getStatus());
// //         // Expected: Not eligible
// //     }
// // }



// package com.example.demo;


// import org.junit.jupiter.api.Test;
// import java.time.LocalDate;

// import static org.junit.jupiter.api.Assertions.*;

// class EligibilityServiceTest {

//     @Test
//     void shouldBeEligibleWhenExactly24MonthsCompleted() {

//         LocalDate startDate = LocalDate.of(2024, 1, 15);
//         LocalDate requestDate = LocalDate.of(2026, 1, 15);

//         PolicyRuleService service = new PolicyRuleService();
//         RuleResult result = service.checkWaitingPeriod(startDate, requestDate);

//         assertEquals(RuleStatus.MET, result.getStatus());
//     }

//     @Test
//     void shouldNotBeEligibleWhenLessThan24MonthsCompleted() {

//         LocalDate startDate = LocalDate.of(2024, 1, 15);
//         LocalDate requestDate = LocalDate.of(2026, 1, 14);

//         PolicyRuleService service = new PolicyRuleService();
//         RuleResult result = service.checkWaitingPeriod(startDate, requestDate);

//         assertEquals(RuleStatus.NOT_MET, result.getStatus());
//     }

//     @Test
//     void shouldBeEligibleWhenMoreThan24MonthsCompleted() {

//         LocalDate startDate = LocalDate.of(2024, 1, 15);
//         LocalDate requestDate = LocalDate.of(2026, 3, 15);

//         PolicyRuleService service = new PolicyRuleService();
//         RuleResult result = service.checkWaitingPeriod(startDate, requestDate);

//         assertEquals(RuleStatus.MET, result.getStatus());
//     }

//     @Test
//     void shouldNotBeEligibleWhenOnly23MonthsCompleted() {

//         LocalDate startDate = LocalDate.of(2024, 1, 15);
//         LocalDate requestDate = LocalDate.of(2025, 12, 15);

//         PolicyRuleService service = new PolicyRuleService();
//         RuleResult result = service.checkWaitingPeriod(startDate, requestDate);

//         assertEquals(RuleStatus.NOT_MET, result.getStatus());
//     }
// }
