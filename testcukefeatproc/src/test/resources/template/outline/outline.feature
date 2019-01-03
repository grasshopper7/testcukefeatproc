Feature: Orders

  Scenario Outline: 
    And Do '<this>' when '<that>' and '<then>'

    Examples: 
      | Data: | src/test/resources/data/excel/exceltwo.xlsx | Sheet1 | A1:C4 |

  Scenario Outline: 
    And Do '<this>' when '<that>' and '<then>'

    Examples: 
      | Data: | src/test/resources/data/json/jsontwo.json | data3 |

  Scenario Outline: 
    And Do '<this>' when '<that>' and '<then>'

    Examples: 
      | Data: | src/test/resources/data/text/textthree.txt | % |
