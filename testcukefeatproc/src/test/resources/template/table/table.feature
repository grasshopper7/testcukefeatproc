Feature: Orders

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/excel/excelone.xlsx | Sheet2 | E8:F9 |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/excel/excelone.xlsx | Sheet1 | A1:C2 | retriever.excel.ExcelTransposeDataRetriever |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/json/jsontwo.json | data2 |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/json/jsonone.json | data1 | retriever.json.JsonExplodedDataRetriever |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/text/textone.txt | , |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/text/texttwo.txt |  |

  Scenario: 
    And Process given datatable
      | Data: | src/test/resources/data/text/texttwo.txt ||

  Scenario: 
    And Process given datatable
      | Data: | retriever.program.ProgramSimpleDataRetriever.java | getTableData |

  Scenario: 
    And Process given datatable
      | Data: | progdata.ProgramArgumentsDataRetriever.java | getChangedTableData | Before | After |