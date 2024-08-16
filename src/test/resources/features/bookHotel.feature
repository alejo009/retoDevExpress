Feature: Book a hotel

  Scenario Outline: book the cheapest hotel that meets the established filters
    Given that "user" has opened web hotel
    When he selects "<city>" of location
    And he enters the check-in date as "<daysCheckIn>" as days from today
    And he selects rooms "<rooms>"  "<adults>" adults and "<children>" children
    And he filters by a price range greater than 200 USD "<offset>"
    And he filters by hotels with "<stars>" stars or more
    And he applies the selected filters
    And he select the cheapest available hotel

    Examples:
      | city    | daysCheckIn | rooms | adults | children | offset | stars |
      | Hamburg | 2           | 2     | 3      | 2        | 1      | 4     |