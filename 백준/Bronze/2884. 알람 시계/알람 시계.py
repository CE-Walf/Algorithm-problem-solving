hour, minute = map(int, input().split())

if minute < 45:
    if hour == 0:
        alarm_hour = 23
    else:
        alarm_hour = hour - 1
    alarm_minute = minute + 15
else:
    alarm_hour = hour
    alarm_minute = minute - 45

print(alarm_hour,alarm_minute)
