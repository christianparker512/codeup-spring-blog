create database if not exists blog_db;
USE blog_db;

DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;
SHOW TABLES;

CREATE TABLE users (
                    email text not null,
                    username text not null,
                    password text not null
                    );
CREATE TABLE posts
                (
                 id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                title VARCHAR(240) NOT NULL,
                body  TEXT         NOT NULL,
                PRIMARY KEY (id)
                );
insert into users (email, username, password) values ('parkeriscreative@gmail.com', 'parkeriscreative', 'opensesame');
insert into users (email, username, password) values ('ldalla0@icio.us', 'mmunslow0', 'kvMjlX6uQoNZ');
insert into users (email, username, password) values ('jstritton1@howstuffworks.com', 'cgerretsen1', 'o6QbOKPZZlM2');
insert into users (email, username, password) values ('gkagan2@state.tx.us', 'bforrester2', 'juLHQxyg6O4');
insert into users (email, username, password) values ('shaslock3@msu.edu', 'pmattisssen3', '1giT8v');
insert into users (email, username, password) values ('mdosdill4@technorati.com', 'adrewett4', 'Tf0h7R');
insert into users (email, username, password) values ('dpaulot5@freewebs.com', 'wveal5', 'Iw5xlpx');
insert into users (email, username, password) values ('bhukin6@toplist.cz', 'ishilstone6', 'hAvwqEjDoBvQ');
insert into users (email, username, password) values ('cbes7@slate.com', 'bcacacie7', '1YrnkrFp5MV');
insert into users (email, username, password) values ('amarjanski8@photobucket.com', 'mmartina8', 'Z3lZlyYsG');
insert into users (email, username, password) values ('jtunnick9@apple.com', 'tchesley9', 'OAHnKOFO');
insert into users (email, username, password) values ('tnockallsa@digg.com', 'ktomalina', '07B7UzGrBL6B');
insert into users (email, username, password) values ('ebreckenb@tiny.cc', 'acartinb', 'tAW5fdRFecGW');
insert into users (email, username, password) values ('tpawlaczykc@ycombinator.com', 'fhartrickc', 'P2b1UmEh');
insert into users (email, username, password) values ('rmewesd@psu.edu', 'kforrid', 'sHSYsaB4');
insert into users (email, username, password) values ('dingleye@skyrock.com', 'mpetree', 'iXXMoP');
insert into users (email, username, password) values ('fhuyghef@java.com', 'hjappf', 'ec54Su');
insert into users (email, username, password) values ('imacklamg@intel.com', 'tevreuxg', 'SU6gYO22');
insert into users (email, username, password) values ('dciccettih@aboutads.info', 'emckeanh', 'pUuWMLw');
insert into users (email, username, password) values ('asilvermanni@friendfeed.com', 'mgalletleyi', 'W7jNaZ');
insert into users (email, username, password) values ('marmigerj@home.pl', 'ctolcharj', '43jd94ST');
insert into users (email, username, password) values ('nweirk@soundcloud.com', 'azealek', '24MYmDeFvhK');
insert into users (email, username, password) values ('fhakel@freewebs.com', 'acozbyl', 'D5NElD');
insert into users (email, username, password) values ('djanouchm@vkontakte.ru', 'ascourgem', 'Se4hoVp08X');
insert into users (email, username, password) values ('azarfatin@princeton.edu', 'mbarnewalln', 'n6OR1b');
insert into users (email, username, password) values ('lwhildero@woothemes.com', 'ktrahairo', 'oenqr5');
insert into users (email, username, password) values ('cveyseyp@ucla.edu', 'bcarnihanp', 'exCsZRFkygg');
insert into users (email, username, password) values ('sdifrancecshiq@tamu.edu', 'tpougherq', 'XmAO9IYhHQ5');
insert into users (email, username, password) values ('ayarkerr@unblog.fr', 'cresdaler', 'wEDCxOa6ltdg');
insert into users (email, username, password) values ('ajessetts@sitemeter.com', 'jgavriels', 'WVT1iA6');
insert into users (email, username, password) values ('bbrindt@mayoclinic.com', 'blowmasst', 'tKY0LMNf');
insert into users (email, username, password) values ('akatzu@nba.com', 'wkehoeu', 'B3x18zzrhKme');
insert into users (email, username, password) values ('teaglenv@ameblo.jp', 'bmanthav', 'kcQ3jrG4AC1G');
insert into users (email, username, password) values ('bgershomw@yandex.ru', 'ldunbletonw', 'zKTPDDXK9');
insert into users (email, username, password) values ('wmacinerneyx@nature.com', 'rmilburnex', '3pTlBm2jVyj');
insert into users (email, username, password) values ('cpurkessy@dion.ne.jp', 'rrutery', 'GlcIqW');
insert into users (email, username, password) values ('gacostaz@google.es', 'gtrickerz', '4RsqzW');
insert into users (email, username, password) values ('ieste10@cam.ac.uk', 'rgrinter10', '0pyvGw3S');
insert into users (email, username, password) values ('dcardoe11@omniture.com', 'jturland11', 'UKKBhbcV1');
insert into users (email, username, password) values ('dbrozsset12@unc.edu', 'mchartman12', 'GOKtqpp');
insert into users (email, username, password) values ('cvandenoord13@bluehost.com', 'ischellig13', 'iOcfSScI');
insert into users (email, username, password) values ('mdinse14@noaa.gov', 'cjannasch14', 'FxDzjatN80v');
insert into users (email, username, password) values ('lstafford15@berkeley.edu', 'nlaviss15', 'zESF6Ge1');
insert into users (email, username, password) values ('fdudbridge16@telegraph.co.uk', 'bdarrach16', 'aBpdGDE91');
insert into users (email, username, password) values ('tffrenchbeytagh17@wordpress.com', 'mstyles17', 'C3D5c7iFk');
insert into users (email, username, password) values ('djeffcoate18@photobucket.com', 'egriswood18', 'o4JOaQX');
insert into users (email, username, password) values ('thearsey19@facebook.com', 'tmitcheson19', 'hkJjCaD');
insert into users (email, username, password) values ('dleaburn1a@artisteer.com', 'sgronaller1a', 'Znu5T488Tw');
insert into users (email, username, password) values ('leger1b@moonfruit.com', 'lrosenboim1b', 'tLmWqJuB7No');
insert into users (email, username, password) values ('ctesseyman1c@newsvine.com', 'gbaish1c', 'xFimZZEWWaXG');
insert into users (email, username, password) values ('jkynder1d@bloglovin.com', 'tcookson1d', '9bJ2BBq');
INSERT INTO posts (id, title, body) values (51,'Christian', 'This will be the first one');
insert into posts (id, title, body) values (1, 'Macheads', 'justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique');
insert into posts (id, title, body) values (2, 'Chasing Sleep', 'pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit');
insert into posts (id, title, body) values (3, 'Shopworn Angel, The', 'sit amet lobortis sapien sapien non mi integer ac neque duis');
insert into posts (id, title, body) values (4, 'Rocketeer, The', 'id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at');
insert into posts (id, title, body) values (5, 'X2: X-Men United', 'volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla');
insert into posts (id, title, body) values (6, 'Big Business', 'lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis');
insert into posts (id, title, body) values (7, 'Return of Frank Cannon, The', 'posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at');
insert into posts (id, title, body) values (8, 'Poughkeepsie Tapes, The', 'aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere');
insert into posts (id, title, body) values (9, 'Sweet Hereafter, The', 'platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel');
insert into posts (id, title, body) values (10, 'Crew, The', 'curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus');
insert into posts (id, title, body) values (11, 'Metroland', 'diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris');
insert into posts (id, title, body) values (12, 'Seafarers, The', 'tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod');
insert into posts (id, title, body) values (13, 'Mr. Denning Drives North', 'donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam');
insert into posts (id, title, body) values (14, 'Jane Eyre', 'nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante');
insert into posts (id, title, body) values (15, 'Corto Maltese: The Guilded House of Samarkand (La maison dorée de Samarkand)', 'aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie');
insert into posts (id, title, body) values (16, 'Intruder, The', 'in consequat ut nulla sed accumsan felis ut at dolor');
insert into posts (id, title, body) values (17, 'Zero Years, The', 'commodo placerat praesent blandit nam nulla integer pede justo lacinia eget');
insert into posts (id, title, body) values (18, 'Benji ', 'dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis');
insert into posts (id, title, body) values (19, 'Little Children', 'imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed');
insert into posts (id, title, body) values (20, 'Heartbeats (Les amours imaginaires)', 'nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio');
insert into posts (id, title, body) values (21, 'Anna', 'turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum');
insert into posts (id, title, body) values (22, 'She Gods of Shark Reef', 'maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in');
insert into posts (id, title, body) values (23, 'Martin & Orloff', 'posuere felis sed lacus morbi sem mauris laoreet ut rhoncus');
insert into posts (id, title, body) values (24, 'Americathon', 'vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus');
insert into posts (id, title, body) values (25, 'This Filthy World', 'platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur');
insert into posts (id, title, body) values (26, 'G. I. Blues', 'erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla');
insert into posts (id, title, body) values (27, 'Witchfinder General (Conquerer Worm, The)', 'pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean');
insert into posts (id, title, body) values (28, 'Take This Job and Shove It', 'felis sed interdum venenatis turpis enim blandit mi in porttitor pede');
insert into posts (id, title, body) values (29, 'Anatomy of a Murder', 'ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus');
insert into posts (id, title, body) values (30, 'Mission Bloody Mary', 'congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget');
insert into posts (id, title, body) values (31, 'Transfer', 'amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum');
insert into posts (id, title, body) values (32, 'Neon Genesis Evangelion: Death & Rebirth (Shin seiki Evangelion Gekijô-ban: Shito shinsei)', 'aliquam convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget');
insert into posts (id, title, body) values (33, 'Afterwards', 'non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at');
insert into posts (id, title, body) values (34, 'Multiplicity', 'eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue');
insert into posts (id, title, body) values (35, 'Bed & Board (Domicile conjugal)', 'tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus');
insert into posts (id, title, body) values (36, 'May 6th (06/05)', 'ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus');
insert into posts (id, title, body) values (37, 'If Lucy Fell', 'ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio');
insert into posts (id, title, body) values (38, 'Intimate Relations', 'vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque');
insert into posts (id, title, body) values (39, 'Western', 'in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis');
insert into posts (id, title, body) values (40, 'Anaconda III', 'varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis');
insert into posts (id, title, body) values (41, 'Under the North Star (Täällä Pohjantähden alla)', 'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus');
insert into posts (id, title, body) values (42, 'Gunbuster (Top wo Narae)', 'ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla');
insert into posts (id, title, body) values (43, 'Incendies', 'metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec');
insert into posts (id, title, body) values (44, 'Spare Parts', 'bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa');
insert into posts (id, title, body) values (45, 'Uuno in Spain', 'orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio');
insert into posts (id, title, body) values (46, 'Pearl Jam: Immagine in Cornice - Live in Italy 2006', 'sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in');
insert into posts (id, title, body) values (47, 'Stranger than Fiction', 'nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit');
insert into posts (id, title, body) values (48, 'Ossos', 'nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum');
insert into posts (id, title, body) values (49, 'Terminator 2: Judgment Day', 'duis aliquam convallis nunc proin at turpis a pede posuere nonummy');
insert into posts (id, title, body) values (50, 'Analyze This', 'neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis');