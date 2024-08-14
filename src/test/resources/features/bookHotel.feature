Feature: Book a hotel

  Scenario Outline: book the cheapest hotel that meets the established filters
    Given that "user" has opened web hotel
    When he selects "<city>" of location
    And he enters the check-in date as "<daysCheckIn>" days from today
    And he enters the check-out date as "<daysCheckOut>" days from today
    And he selects "<rooms>" rooms
    And he selects "<adults>" adults and <children> children
    And he click on search button
    And he filters by a price range greater than <minPrice> USD
    And he filters by hotels with <starts> starts or more
    And he applies the selected filters
    And he selects the cheapest available hotel

    Examples:
      | city    | daysCheckIn | daysCheckOut | rooms | adults | children | minPrice | starts |
      | Hamburg | 2           | 7            | 2     | 3      | 2        | 201      | 3      |