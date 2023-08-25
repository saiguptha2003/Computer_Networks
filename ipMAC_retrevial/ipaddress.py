import socket
import uuid
# hostname=socket.gethostname("www.google.com")
# IPAddr=socket.gethostbyname(hostname)
# mac=uuid.getnode()
# mac=':'.join(("%012X" % mac) [i:i+2] for i in range(0,12,2))
# with open('/sys/class/net/eth0/address') as f:
#     mac = f.read()

# print(IPAddr)
# print(mac)

def getipofdomain(domain):
    ip=socket.gethostbyname(domain)
    print(ip)
getipofdomain("www.google.com")