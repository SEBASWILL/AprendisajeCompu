import os


b = input('mensaje de commit: ')
a = "main"
os.system('git add *')
os.system('git commit -m "'+b+'"')
os.system('git push origin '+a)