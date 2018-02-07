import datetime
from datetime import timedelta
print ("Howard's Volunteer Days")

start = datetime.date(2018, 2, 9)
end = datetime.date(2018, 6, 1)
print ("Start: {:%A %B %d, %Y}".format(start))
print ("End: {:%A %B %d, %Y}".format(end))

list = []
dt = start
while dt <= end:
    list.append(dt)
    dt += timedelta(days=14)

for dt in list:
    print ("\t{:%A %B %d, %Y}".format(dt))
